<h1 align="center">SQL</h1>
<p><b>SQL</b> (Structured Query Language) es un lenguaje estándar utilizado para interactuar con sistemas de gestión de bases de datos relacionales (RDBMS por sus siglas en inglés).</p>
<p><b>SQL</b> proporciona un conjunto de comandos y cláusulas que permiten realizar una variedad de operaciones en una base de datos. Estas operaciones incluyen la creación y modificación de esquemas de bases de datos, la inserción, modificación y eliminación de datos, así como la recuperación de datos mediante consultas.</p>

Algunos de los conceptos y características clave de `SQL`:
-  <b>Declarativo</b>: `SQL` es un lenguaje de consulta declarativo, lo que significa que los usuarios describen qué datos desean recuperar o manipular, en lugar de especificar cómo deben realizarse las operaciones. Esto permite a los usuarios enfocarse en los resultados deseados en lugar de los detalles de implementación.
-  <b>Operaciones CRUD</b>: `SQL` permite realizar cuatro operaciones básicas en datos: Create (crear), Read (leer), Update (actualizar) y Delete (eliminar). Estas operaciones se conocen comúnmente como operaciones CRUD y son fundamentales en la gestión de datos.
-  <b>Tipos de datos</b>: `SQL` proporciona una variedad de tipos de datos para representar diferentes tipos de información, como enteros, cadenas de caracteres, fechas, booleanos, entre otros. Estos tipos de datos pueden variar ligeramente según el sistema de gestión de bases de datos utilizado. 
-  <b>Consultas</b>: `SQL` permite realizar consultas complejas para recuperar datos de una o más tablas de una base de datos. Las consultas pueden incluir múltiples condiciones, funciones de agregación, ordenamientos, agrupamientos y uniones entre tablas.
-  <b>Transacciones</b>: `SQL` proporciona soporte para transacciones, que son secuencias de operaciones que se ejecutan como una sola unidad lógica. Esto garantiza la integridad y consistencia de los datos al realizar operaciones complejas que afectan múltiples registros.
-  <b>Seguridad</b>: `SQL` incluye mecanismos para gestionar la seguridad de la base de datos, como la definición de usuarios y roles, así como la asignación de permisos para acceder y manipular datos.

<h3>Consulta SQL</h3>
<p>Una consulta SQL es una instrucción utilizada para recuperar datos de una base de datos. Estas consultas pueden ser muy simples o bastante complejas, dependiendo de las necesidades del usuario. Las consultas SQL se componen principalmente de tres tipos de instrucciones:</p>

-  `SELECT`: Se utiliza para recuperar datos de una o más tablas de la base de datos. Puede seleccionar todas las columnas de una tabla o columnas específicas, filtrar filas según ciertos criterios, ordenar los resultados y más. Por ejemplo:
```sql
SELECT * FROM employees;
```
Esta consulta selecciona todas las columnas de la tabla `employees`.
-  `INSERT`: Se utiliza para insertar nuevos registros en una tabla de la base de datos. Puede especificar los valores que se insertarán en cada columna. Por ejemplo:
```sql
INSERT INTO employees (first_name, last_name, age) VALUES ('John', 'Doe', 30);
```
Esta consulta inserta un nuevo registro en la tabla `employees` con los valores proporcionados.
-  `UPDATE`: Se utiliza para actualizar registros existentes en una tabla de la base de datos. Puede modificar los valores de una o más columnas en función de ciertos criterios de selección. Por ejemplo:
```sql
UPDATE employees SET age = 31 WHERE first_name = 'John';
```
Esta consulta actualiza el valor de la columna `age` en la tabla `employees` para aquellos registros cuyo `first_name` sea 'John'.
-  `DELETE`: Se utiliza para eliminar registros de una tabla de la base de datos. Puede especificar ciertos criterios de selección para eliminar solo los registros deseados. Por ejemplo:
```sql
DELETE FROM employees WHERE age > 65;
```
Esta consulta elimina todos los registros de la tabla `employees` donde el valor de la columna `age` sea mayor que 65.

<p>Además de estas instrucciones básicas, SQL también incluye otras características más avanzadas, como funciones de <b>agregación (SUM, AVG, COUNT, etc.)</b>, operaciones de <b>unión (JOIN)</b>, cláusulas de <b>filtrado (WHERE)</b>, cláusulas de <b>agrupamiento (GROUP BY)</b>, cláusulas de <b>ordenamiento (ORDER BY)</b>, entre otras.</p>

<h2 align="center">'Lenguaje de Definicion de Datos' y 'Lenguaje de Manipulacion de Datos'</h2>
<h3>Lenguaje de Definición de Datos (DDL)</h3>

-  El DDL se utiliza para definir la estructura y las características de la base de datos.
-  Incluye comandos como `CREATE`, `ALTER` y `DROP`, que se utilizan para crear, modificar y eliminar objetos de la base de datos, como tablas, índices, vistas, etc.
-  Permite definir restricciones de integridad como claves primarias, claves foráneas, restricciones únicas, entre otros.
-  Ejemplos de comandos `DDL` incluyen:
    -  `CREATE TABLE` para crear una nueva tabla en la base de datos.
    -  `ALTER TABLE` para modificar la estructura de una tabla existente.
    -  `DROP TABLE` para eliminar una tabla de la base de datos.
 
<h3>Lenguaje de Manipulación de Datos (DML)</h3>

-  El DML se utiliza para manipular los datos almacenados en la base de datos.
-  Incluye comandos como `INSERT`, `SELECT`, `UPDATE` y `DELETE`, que se utilizan para agregar, consultar, actualizar y eliminar datos de la base de datos, respectivamente.
-  Permite realizar consultas complejas para recuperar información específica de la base de datos utilizando la cláusula `SELECT`.
-  Facilita la inserción, actualización y eliminación de datos según sea necesario.
-  Ejemplos de comandos `DML` incluyen:
    -  `INSERT INTO` para agregar nuevos registros a una tabla.
    -  `SELECT` para recuperar datos de una tabla o vistas.
    -  `UPDATE` para modificar datos existentes en una tabla.
    -  `DELETE FROM` para eliminar registros de una tabla.
 
<h1 align="center">MySQL</h1>
<p>MySQL es un sistema de gestión de bases de datos relacional (RDBMS) de código abierto muy popular y ampliamente utilizado en la industria.</p>

Algunas características clave de `MySQL`: 
 -  <b>Esquema Relacional</b>: `MySQL` es una base de datos relacional, lo que significa que organiza los datos en tablas que están relacionadas entre sí mediante claves primarias y foráneas.
 -  <b>Multiplataforma</b>: `MySQL` está disponible para una variedad de plataformas, incluyendo Linux, Windows, macOS y diferentes sistemas Unix.
 -  <b>Multiusuario y Multihilo</b>: `MySQL` es un sistema de base de datos multiusuario y multihilo, lo que significa que puede manejar múltiples conexiones de usuarios simultáneamente y procesar múltiples solicitudes de manera eficiente.
 -  <b>Soporte para Transacciones</b>: `MySQL` ofrece soporte para transacciones ACID (Atomicidad, Consistencia, Aislamiento y Durabilidad), lo que garantiza la integridad y la consistencia de los datos incluso en entornos de múltiples usuarios.
 -  <b>Replicación y Clustering</b>: `MySQL` permite la replicación de datos entre múltiples servidores para mejorar la disponibilidad y la tolerancia a fallos, así como la configuración de clústeres para mejorar la escalabilidad y el rendimiento.
 -  <b>Almacenamiento de Datos</b>: `MySQL` proporciona varios motores de almacenamiento, incluyendo InnoDB (predeterminado), MyISAM, MEMORY, ARCHIVE, entre otros. Cada motor tiene sus propias características y se adapta a diferentes necesidades de almacenamiento y rendimiento.
 -  <b>Soporte para Diversos Lenguajes de Programación</b>: `MySQL` es compatible con una variedad de lenguajes de programación, incluyendo PHP, Java, Python, Ruby, entre otros, lo que facilita su integración con aplicaciones web y de escritorio.
 -  <b>Herramientas de Administración y Monitorización</b>: `MySQL` viene con una variedad de herramientas de administración y monitorización, como MySQL Workbench, MySQL Command-Line Client y MySQL Enterprise Monitor, que facilitan la gestión y el mantenimiento de las bases de datos MySQL.

<h1 align="center">JDBC</h1>
<p><b>JDBC (Java Database Connectivity)</b> es una API (Interfaz de Programación de Aplicaciones) de Java que proporciona un conjunto de clases e interfaces para permitir que las aplicaciones Java se conecten y manipulen bases de datos relacionales.</p>
<p align="center"><img width="700" alt="image" src="https://github.com/CCrisstian/Java_JDBC/assets/111469216/b6c876dc-18ba-41c2-8678-461e9577ebef"></p>

Algunas características clave de `JDBC`:
 -  <b>Conexión a la Base de Datos</b>: `JDBC` proporciona clases para establecer una conexión con una base de datos, como `DriverManager` y `Connection`, permitiendo que las aplicaciones Java interactúen con la base de datos.
 -  <b>Ejecución de Consultas</b>: `JDBC` permite enviar consultas SQL a la base de datos y obtener resultados utilizando objetos como `Statement`, `PreparedStatement` y `CallableStatement`.
 -  <b>Manipulación de Resultados</b>: `JDBC` proporciona clases como `ResultSet` para representar conjuntos de resultados de consultas SQL, lo que permite a las aplicaciones Java procesar y manipular los datos recuperados de la base de datos.
 -  <b>Control de Transacciones</b>: `JDBC` permite a las aplicaciones Java administrar transacciones mediante la utilización de objetos como `Connection` y métodos como `commit()` y `rollback()`.
 -  <b>Manejo de Excepciones</b>: `JDBC` proporciona manejo de excepciones para errores relacionados con la conexión a la base de datos, la ejecución de consultas y la manipulación de resultados, lo que garantiza una gestión adecuada de posibles errores.
 -  <b>Independencia de la Base de Datos</b>: `JDBC` permite a los desarrolladores escribir código Java independiente de la base de datos subyacente, lo que facilita la portabilidad de las aplicaciones entre diferentes sistemas de gestión de bases de datos (DBMS) sin necesidad de realizar cambios significativos en el código.
 -  <b>Soporte para Diversos Tipos de Bases de Datos</b>: `JDBC` es compatible con una amplia gama de bases de datos relacionales, incluyendo <b>MySQL</b>, <b>PostgreSQL</b>, <b>Oracle</b>, <b>SQL Server</b>, <b>SQLite</b>, entre otros.

<h2 align="center">'DriverManager'</h2>
<p>La clase <b>DriverManager</b> es parte de la API JDBC (Java Database Connectivity) y se utiliza para administrar un conjunto de controladores de bases de datos. Su principal función es facilitar la conexión de una aplicación Java con una base de datos mediante la carga y gestión de los controladores JDBC necesarios.</p>

Métodos más importantes de la clase `DriverManager`:
-  `registerDriver(Driver driver)`: Registra un controlador de bases de datos con el `DriverManager`. Este método es generalmente utilizado internamente por los controladores JDBC durante su inicialización, por lo que rara vez se llama explícitamente.
-  `getConnection(String url)`: Establece una conexión a la base de datos utilizando la URL de conexión proporcionada. Esta es la forma más básica de obtener una conexión y generalmente se utiliza cuando no se necesitan propiedades adicionales de conexión.
-  `getConnection(String url, Properties info)`: Establece una conexión a la base de datos utilizando la URL de conexión y las propiedades adicionales proporcionadas. Las propiedades pueden incluir el nombre de usuario, la contraseña y otras opciones específicas del controlador.
-  `getConnection(String url, String user, String password)`: Establece una conexión a la base de datos utilizando la URL de conexión, el nombre de usuario y la contraseña proporcionados.
-  `getDrivers()`: Devuelve un Enumeration que contiene los controladores de bases de datos registrados con el `DriverManager`.
-  `deregisterDriver(Driver driver)`: Cancela el registro de un controlador de bases de datos con el `DriverManager`.

<h2 align="center">'Connection'</h2>
<p>La clase <b>Connection</b> es parte de la API JDBC (Java Database Connectivity) y representa una conexión activa a una base de datos. Es responsable de establecer y mantener la comunicación entre una aplicación Java y una base de datos subyacente.</p>

Métodos más importantes de la clase `Connection`:
-  `createStatement()`: Crea un objeto `Statement` que se puede utilizar para enviar consultas SQL simples a la base de datos.
-  `prepareStatement(String sql)`: Crea un objeto `PreparedStatement` que se utiliza para enviar consultas SQL precompiladas a la base de datos. Este método es preferible cuando se necesitan realizar consultas parametrizadas.
-  `prepareCall(String sql)`: Crea un objeto `CallableStatement` que se utiliza para ejecutar procedimientos almacenados o funciones definidos en la base de datos.
-  `close()`: Cierra la conexión con la base de datos. Es importante cerrar la conexión una vez que ya no se necesite para liberar los recursos y evitar posibles fugas de memoria.
-  `commit()`: Confirma la transacción actual. Los cambios realizados en la base de datos dentro de la transacción se vuelven permanentes.
-  `rollback()`: Deshace la transacción actual y revierte los cambios realizados en la base de datos dentro de la transacción.
-  `setAutoCommit(boolean autoCommit)`: Establece si la conexión debe realizar automáticamente la confirmación después de cada operación o si debe administrarse manualmente mediante las llamadas explícitas a `commit()` o `rollback()`.
-  `setTransactionIsolation(int level)`: Establece el nivel de aislamiento de la transacción. Esto determina el grado en que las transacciones concurrentes pueden afectar a otras transacciones en la base de datos.
-  `getMetaData()`: Devuelve un objeto `DatabaseMetaData` que contiene información sobre la base de datos a la que está conectada la conexión.
-  `setReadOnly(boolean readOnly)`: Establece si la conexión debe ser de solo lectura o si se permite realizar modificaciones en la base de datos.
-  `isClosed()`: Devuelve `true` si la conexión está cerrada y `false` si está abierta.
-  `isValid(int timeout)`: Verifica si la conexión sigue siendo válida. Esto puede ser útil para evitar conexiones inactivas o muertas

<h2 align="center">'Statement'</h2>
<p>La clase <b>Statement</b> es parte de la API JDBC (Java Database Connectivity) y se utiliza para enviar instrucciones SQL a una base de datos. Es una interfaz que representa una declaración estática que se ejecuta en una conexión a la base de datos y puede contener consultas de inserción, actualización, eliminación o selección.</p>

Métodos más importantes de la clase `Statement`:
-  `executeQuery(String sql)`: Ejecuta una consulta SQL que devuelve un conjunto de resultados en forma de objeto `ResultSet`. Se utiliza para consultas de selección que recuperan datos de la base de datos.
-  `executeUpdate(String sql)`: Ejecuta una instrucción SQL que realiza una acción en la base de datos, como insertar, actualizar o eliminar registros. Devuelve el número de filas afectadas por la operación.
-  `execute(String sql)`: Ejecuta una instrucción SQL que puede ser una consulta de selección, una instrucción de modificación o cualquier otra instrucción SQL. Devuelve true si el primer resultado es un objeto `ResultSet` (una consulta) y `false` si es un recuento de filas afectadas o no hay resultados.
-  `close()`: Cierra el `Statement` y libera los recursos asociados.
-  `getResultSet()`: Devuelve el objeto `ResultSet` que contiene los resultados de la última consulta, si hubo alguna.
-  `getConnection()`: Devuelve la conexión a la base de datos a la que está asociado este `Statement`.
-  `addBatch(String sql)`: Agrega una instrucción SQL al lote actual. Las declaraciones en el lote se pueden ejecutar juntas como una sola unidad, lo que puede mejorar el rendimiento de las operaciones en lotes.
-  `clearBatch()`: Borra todas las declaraciones agregadas al lote actual.
-  `executeBatch()`: Ejecuta todas las declaraciones en el lote actual como una sola unidad y devuelve un arreglo de enteros que contiene el número de filas afectadas por cada declaración.

<h2 align="center">'ResultSet'</h2>
<p>La clase <b>ResultSet</b> es parte de la API JDBC (Java Database Connectivity) y se utiliza para representar un conjunto de resultados obtenidos después de ejecutar una consulta SQL en una base de datos. Esta clase proporciona métodos para navegar por los datos recuperados y acceder a los valores de cada fila del resultado.</p>

Métodos más importantes de la clase `ResultSet`:
-  `next()`: Mueve el cursor del resultado a la siguiente fila. Devuelve `true` si hay más filas disponibles y `false` si no hay más filas.
-  `getInt(int columnIndex)` / `getString(int columnIndex)` / `getXXX(int columnIndex)`: Devuelve el valor de la columna especificada en la fila actual, donde XXX puede ser un tipo de dato como `Int`, `String`, `Double`, etc. El índice de columna comienza desde 1.
-  `getInt(String columnName)` / `getString(String columnName)` / `getXXX(String columnName)`: Devuelve el valor de la columna especificada por su nombre en la fila actual.
-  `close()`: Cierra el `ResultSet` y libera los recursos asociados.
-  `beforeFirst()`, `afterLast()`, `first()`, `last()`, `absolute(int row)`, `relative(int rows)`: Métodos para mover el cursor del resultado a una fila específica. Estos métodos son útiles para navegar por el conjunto de resultados de manera eficiente.
-  `getMetaData()`: Devuelve un objeto `ResultSetMetaData` que proporciona metadatos sobre las columnas del conjunto de resultados, como el nombre de la columna, el tipo de datos, la precisión, etc.
-  `wasNull()`: Devuelve `true` si el valor recuperado por el método `getXXX()` anterior era `NULL`.
-  `getType()`, `getConcurrency()`, `getHoldability()`: Métodos para obtener información sobre el tipo de resultado, la concurrencia y la retención de resultados.

<h2 align="center">DAO (Data Access Object)</h2>
<p>El patrón <b>DAO (Data Access Object)</b> es un patrón de diseño utilizado en el desarrollo de software para separar la lógica de acceso a datos de la lógica de negocio en una aplicación. El objetivo principal del patrón DAO es abstraer y encapsular la forma en que los datos se acceden y manipulan en una base de datos o cualquier otro origen de datos.</p>
<p>En esencia, un DAO actúa como una capa intermedia entre la aplicación y la base de datos, proporcionando una interfaz de alto nivel para realizar operaciones <b>CRUD (Crear, Leer, Actualizar, Eliminar)</b> en los datos, sin exponer los detalles de implementación subyacentes al resto de la aplicación.</p>

Algunos conceptos clave asociados con el patrón `DAO`:
-    <b>Interfaz</b> `DAO`: Define los métodos que representan las operaciones básicas de acceso a datos, como insertar, recuperar, actualizar y eliminar datos. Esta interfaz oculta los detalles de implementación específicos de la fuente de datos.
-    <b>Implementación</b> `DAO`: Proporciona la implementación concreta de la interfaz `DAO` para un determinado tipo de fuente de datos, como una base de datos relacional, un servicio web, un archivo plano, etc.
-    <b>Clases de Entidades</b>: Representan las entidades o modelos de datos que se almacenan en la fuente de datos. Estas clases suelen ser objetos simples de Java con propiedades que corresponden a las columnas de la tabla en una base de datos relacional.
-    <b>Conexión a la Base de Datos</b>: En algunos casos, el `DAO` se encarga de establecer y administrar la conexión a la base de datos. Sin embargo, en entornos modernos, es común utilizar herramientas de gestión de conexiones, como pools de conexiones, para gestionar las conexiones de manera eficiente.

Beneficios del patrón `DAO`:
-    <b>Separación de Responsabilidades</b>: Permite separar la lógica de negocio de la lógica de acceso a datos, lo que facilita la reutilización y el mantenimiento del código.
-    <b>Abstracción de la Fuente de Datos</b>: Oculta los detalles de implementación específicos de la fuente de datos, lo que permite cambiar la fuente de datos sin afectar el resto de la aplicación.
-    <b>Facilita las Pruebas Unitarias</b>: Al proporcionar una interfaz clara y bien definida, el código que utiliza un `DAO` se puede probar fácilmente utilizando objetos simulados o mock.


<h2 align="center">CRUD</h2>
<p><b>CRUD</b> es un acrónimo que representa las cuatro operaciones básicas en la manipulación de datos en bases de datos relacionales y otros sistemas de almacenamiento de datos.</p>

 Las cuatro operaciones `CRUD` son:
-    `Create` (Crear): Esta operación se refiere a la creación de nuevos registros o entradas en una base de datos. En SQL, esto se logra mediante la sentencia `INSERT INTO`, que permite agregar nuevos datos a una tabla existente.
-    `Read` (Leer): Esta operación implica la recuperación de datos existentes de una base de datos. En SQL, esto se realiza utilizando la sentencia `SELECT`, que permite seleccionar y recuperar datos de una o más tablas.
-    `Update` (Actualizar): Esta operación implica la modificación de datos existentes en una base de datos. En SQL, esto se logra mediante la sentencia `UPDATE`, que permite modificar los valores de una o más columnas en registros existentes en una tabla.
-    `Delete` (Eliminar): Esta operación implica la eliminación de datos existentes de una base de datos. En SQL, esto se realiza utilizando la sentencia `DELETE FROM`, que permite eliminar registros de una tabla según ciertos criterios especificados.

<p>Juntas, estas cuatro operaciones forman la base de la funcionalidad de gestión de datos en sistemas de bases de datos relacionales y no relacionales. Son esenciales para la creación, lectura, actualización y eliminación de datos en cualquier aplicación que interactúe con una base de datos.</p>
