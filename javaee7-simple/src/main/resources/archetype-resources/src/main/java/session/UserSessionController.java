#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.session;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;

import ${package}.dao.UserDAO;
import ${package}.model.User;

@SessionScoped
public class UserSessionController implements Serializable {

    private static final long serialVersionUID = -345738659450907245L;

    @Inject
    private UserDAO userDAO;

    private List<User> users;

    @PostConstruct
    public void initSession() {
        users = userDAO.getAll();
    }

    public List<User> getUsers() {
        return users;
    }

}
