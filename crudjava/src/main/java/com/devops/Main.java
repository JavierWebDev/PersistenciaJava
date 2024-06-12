package com.devops;

public class Main {
    public static void main(String[] args) {
        PersonaDAO personaDAO = new PersonaDAO();
        
        // Crear una nueva persona
        Persona persona1 = new Persona(1, "juan", 25);
        personaDAO.createPersona(persona1);

        // Leer todas las personas
    }
}