Spring Data JPA:
src/main/java/com/example/app/model/Product.java (entidad JPA)
src/main/java/com/example/app/repository/ProductRepository.java (interfaz JpaRepository)
Plain JDBC (JdbcTemplate):
src/main/java/com/example/app/model/Product.java (DTO/entidad, puede ser la misma clase)
src/main/java/com/example/app/jdbc/ProductRowMapper.java (mapea filas a Product)
src/main/java/com/example/app/jdbc/ProductJdbcRepository.java (usa JdbcTemplate para CRUD)
Breve explicación: la entidad mapea la tabla; con Spring Data sólo necesitas la interfaz JpaRepository. Para JDBC necesitas un RowMapper y un repositorio que use JdbcTemplate (o SimpleJdbcInsert) para realizar operaciones.




Notas cortas:
spring-boot-starter-data-jdbc ya está en tu build.gradle.
Para inserts deja productId nulo; Spring Data JDBC (con el driver Oracle) recuperará la clave generada si la DB usa IDENTITY.
Si necesitas auditoría (p. ej. auto-popular CREATED_AT) añade Spring Data JDBC auditing o establece CREATED_AT por la DB (como SYSDATE).