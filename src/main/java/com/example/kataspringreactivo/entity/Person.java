package com.example.kataspringreactivo.entity;

public class Person {

    private String name;
    private String edad;
    private String telefono;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String nombre, String edad, String telefono) {
        this.name = nombre;
        this.edad = edad;
        this.telefono = telefono;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
