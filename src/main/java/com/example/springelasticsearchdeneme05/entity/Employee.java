package com.example.springelasticsearchdeneme05.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Document(indexName = "employeeindex")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    @Id
    private String id;

    @Field(type = FieldType.Text, name = "employeeId")
    private String employeeId;

    @Field(type = FieldType.Text, name = "firstName")
    private String firstName;

    @Field(type = FieldType.Text, name = "lastName")
    private String lastName;

    @Field(type = FieldType.Text, name = "street")
    private String street;

    @Field(type = FieldType.Text, name = "city")
    private String city;

    @Field(type = FieldType.Text, name = "state")
    private String state;

    @Field(type = FieldType.Text, name = "zip")
    private String zip;

    @Field(type = FieldType.Text, name = "department")
    private String department;

    @Field(type = FieldType.Double, name = "salary")
    private Double salary;

}