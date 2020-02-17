# Vueling-BDD
Búsqueda de un vuelo en vueling.com con Serenity y Cucumber

- Uso del patrón Screenplay

Ejecutar: ``mvn verify``

`Error: Vueling realiza una prueba A/B en la página de vuelos, puede fallar si redirecciona a la nueva página`

En /src/test/java/acceptancetest/RunnerBase se encuentra la config del WebDriverManager

https://github.com/bonigarcia/webdrivermanager 

        <dependency>
            <groupId>io.github.bonigarcia</groupId>
            <artifactId>webdrivermanager</artifactId>
            <version>3.8.1</version>
            <scope>test</scope>
        </dependency>


