import java.*;

//Interface para exeplo do exercício da aula 4 de Orientação a Objeto

public static void main(String[] args) {
    interface OperacoesMatematicas{

        void soma(double operador1, double operador2);

        void subtracao(double operador1, double operador2);

        void divisao(double operador1, double operador2);

        void multiplicacao(double operador1, double operador2);
    }
}