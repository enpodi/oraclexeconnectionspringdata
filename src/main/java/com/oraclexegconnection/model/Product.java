package com.oraclexegconnection.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.data.relational.core.mapping.Column;
import lombok.ToString;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Table("PRODUCT")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString(exclude = "createdAt", includeFieldNames = true)
public class Product {

    @Id
    @Column("PRODUCT_ID")
    private Long productId;

    @Column("NAME")
    private String name;

    @Column("DESCRIPTION")
    private String description;

    @Column("PRICE")
    private BigDecimal price;

    @Column("CREATED_AT")
    private LocalDateTime createdAt;

}