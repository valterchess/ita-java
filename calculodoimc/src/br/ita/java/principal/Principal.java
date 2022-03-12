package br.ita.java.principal;

import br.ita.java.modelos.Paciente;

public class Principal {
    public static void main(String[] args) {
        Paciente paciente1 = new Paciente(70, 174);
        Paciente paciente2 = new Paciente(94, 168);
        Paciente paciente3 = new Paciente(67, 159);

        paciente1.diagnostico();
        paciente2.diagnostico();
        paciente3.diagnostico();
    }
}
