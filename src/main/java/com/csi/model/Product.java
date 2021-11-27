package com.csi.model;



import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.javafx.geom.Shape;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class Product {

    @Id
    @GeneratedValue

    private int prodId;

    private  String prodName;

    private long prodNumber;

    private double prodPrice;

    @JsonFormat(shape = JsonFormat.Shape.STRING , pattern = "dd-MM-yyyy" , timezone = "Asia/Kolkata")
    private Date prodManufacturingDate;

    private String prodEmail;

}
