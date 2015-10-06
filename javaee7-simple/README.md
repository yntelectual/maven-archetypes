# Simplest JavaEE web app possible

No batteries included. This archetype is just what the title says, nothing more.
Its intended use is for quick testing of features or HTML web apps with possible
future integration with JavaEE.

Please note the limitations of this project, namely :

- no support for tests of any kind
- no additional plugins except for bare minimum(war, compile)
- no server assumptions
- very simplistic boilerplate code
- no HTML code or starter

## how to create a project based on this archetype

```
mvn archetype:generate -Dfilter=com.binarytale.archetypes:javaee-simple
```
    
## build and deploy

In the project directory run:

```sh
mvn clean install
```

After successful build move the resulting ```.war``` file in ```target``` folder to the JavaEE 7 server of your choice.