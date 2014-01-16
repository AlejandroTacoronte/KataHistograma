package katahistograma;

public class Person {
    
    private String name;
    private Email email;
    private Sex sexo;

    public Person(String name, Email email, Sex sexo) {
        this.name = name;
        this.email = email;
        this.sexo = sexo;
    }

    public String getName() {
        return name;
    }

    public Email getEmail() {
        return email;
    }

    public Sex getSexo() {
        return sexo;
    }

}
