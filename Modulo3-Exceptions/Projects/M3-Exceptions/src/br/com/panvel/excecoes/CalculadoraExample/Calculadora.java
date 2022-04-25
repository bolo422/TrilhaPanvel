package br.com.panvel.excecoes.CalculadoraExample;

public abstract class Calculadora {

    static double dividir(double dividendo, double divisor)
    {
        if(divisor == 0)
            throw new DivisaoPorZero();
        else
            return dividendo/divisor;
    }

    static double dividirPares(double dividendo, double divisor) throws DivisaoComImpar
    {
        if(divisor == 0)
            throw new DivisaoPorZero();
        if(dividendo % 2 != 0 || divisor % 2 != 0)
            throw new DivisaoComImpar();
        return dividendo/divisor;
    }


}
