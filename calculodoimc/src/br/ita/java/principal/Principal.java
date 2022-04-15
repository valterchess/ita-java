package main.br.ita.java.principal;

import main.br.ita.java.modelos.Paciente;

public class Principal {
    public static void main(String[] args) {
        Paciente paciente1 = new Paciente(70, 1.74);
        Paciente paciente2 = new Paciente(94, 1.68);
        Paciente paciente3 = new Paciente(67, 1.59);

        paciente1.diagnostico();
        paciente2.diagnostico();
        paciente3.diagnostico();
    }
}
