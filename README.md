Spring Data JPA:
src/main/java/com/example/app/model/Product.java (entidad JPA)
src/main/java/com/example/app/repository/ProductRepository.java (interfaz JpaRepository)
Plain JDBC (JdbcTemplate):
src/main/java/com/example/app/model/Product.java (DTO/entidad, puede ser la misma clase)
src/main/java/com/example/app/jdbc/ProductRowMapper.java (mapea filas a Product)
src/main/java/com/example/app/jdbc/ProductJdbcRepository.java (usa JdbcTemplate para CRUD)
Breve explicación: la entidad mapea la tabla; con Spring Data sólo necesitas la interfaz JpaRepository. Para JDBC necesitas un RowMapper y un repositorio que use JdbcTemplate (o SimpleJdbcInsert) para realizar operaciones.
