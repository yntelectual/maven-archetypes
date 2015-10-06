#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.rest;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import ${package}.cdi.Trace;
import ${package}.model.User;
import ${package}.session.UserSessionController;

@Path("/users")
@RequestScoped
@Trace
public class UserEndpoint {

    //note this is not the best idea in stateless design, to inject session into REST,
    //it is here merely as a demonstration of CDI. The less data you keep in session the more
    //scalable you app will be
    @Inject
    private UserSessionController sessionCtrl;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/")
    public List<User> getAll() {
        return sessionCtrl.getUsers();
    }
}
