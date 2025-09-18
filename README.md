Agenda de Contactos en Java
Una aplicación de consola simple para gestionar contactos, desarrollada en Java.

Características
✅ Añadir nuevos contactos con nombre y teléfono

✅ Mostrar todos los contactos almacenados

✅ Buscar contactos por nombre

✅ Interfaz de consola intuitiva

✅ Salida controlada de la aplicación

Estructura del Proyecto
text
AgendaContactos/
├── Main.java          # Clase principal con el menú de la aplicación
├── Contacto.java      # Clase que representa un contacto individual
└── Agenda.java        # Clase que gestiona la lista de contactos
Funcionalidades
1. Añadir Contacto
Permite agregar nuevos contactos ingresando nombre y número de teléfono.

2. Mostrar Contactos
Muestra todos los contactos almacenados en la agenda en formato: Nombre - Teléfono

3. Buscar Contacto
Busca un contacto por nombre y muestra su información si existe.

4. Salir
Cierra la aplicación de manera controlada.

Requisitos
Java JDK 8 o superior

Cualquier IDE que soporte Java o compilador desde línea de comandos

Compilación y Ejecución
Desde línea de comandos:
bash
# Compilar
javac Main.java Contacto.java Agenda.java

# Ejecutar
java Main
Desde un IDE:
Abre el proyecto en tu IDE favorito (Eclipse, IntelliJ, NetBeans)

Compila el proyecto

Ejecuta la clase Main

Uso
Al iniciar la aplicación, se mostrará un menú con las opciones disponibles

Ingresa el número correspondiente a la acción deseada

Sigue las instrucciones en pantalla para cada operación

Ejemplo de uso

Agenda de Contactos
1. Añadir contacto
2. Mostrar todos los contactos
3. Buscar contacto
4. Salir
Selecciona una opcion: 1
Introduzca el nombre: Juan
Introduzca el telefono: 123456789
Contacto añadido correctamente.
Notas
Los contactos se almacenan en memoria durante la ejecución del programa

Los datos se pierden al cerrar la aplicación

La búsqueda es sensible a mayúsculas y minúsculas

Mejoras Futuras
Persistencia de datos en archivo

Validación de números de teléfono

Edición y eliminación de contactos

Categorización de contactos

Búsqueda por número de teléfono

Autor
Renzo Guillermo Carrillo Ruiz.

