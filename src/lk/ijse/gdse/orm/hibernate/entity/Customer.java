package lk.ijse.gdse.orm.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Customer")
public class Customer {
    @Id
    @Column(name = "customer id")
    private int id;
    @Column(name = "customer name")
    private String name;
    @Column(name = "customer address")
    private String address;
    @Column(name="customer salary")
    private double salary;

}
