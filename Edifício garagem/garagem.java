import java.util.Scanner;

// Classe base Veiculo
abstract class Veiculo {
    String tipo;
    double peso;

    public Veiculo(String tipo, double peso) {
        this.tipo = tipo;
        this.peso = peso;
    }

    public abstract double calcularPrecoPorHora();
}

// Classe Motocicleta
class Motocicleta extends Veiculo {

    public Motocicleta(String tipo, double peso) {
        super(tipo, peso);
    }

    @Override
    public double calcularPrecoPorHora() {
        if (peso <= 100) {
            return 2.0;
        } else if (peso <= 299.9) {
            return 4.0;
        } else {
            return 10.0;
        }
    }
}

// Classe CarroPasseio para hatchback e sedan
class CarroPasseio extends Veiculo {
    public CarroPasseio(String tipo, double peso) {
        super(tipo, peso);
    }

    @Override
    public double calcularPrecoPorHora() {
        if (peso <= 2.0) {
            if (tipo.equalsIgnoreCase("hatchback")) {
                return 13.0;
            } else if (tipo.equalsIgnoreCase("sedan")) {
                return 15.0;
            }
        } else {
            System.out.println("Carro de passeio acima de 2 toneladas será classificado como SUV.");
            return 20.0; // Classifica como SUV automaticamente
        }
        return 0.0;
    }
}

// Classe Caminhonete
class Caminhonete extends Veiculo {
    boolean carregada;

    public Caminhonete(String tipo, double peso, boolean carregada) {
        super(tipo, peso);
        this.carregada = carregada;
    }

    @Override
    public double calcularPrecoPorHora() {
        if (peso <= 3.0) {
            return 25.0;
        } else if (peso <= 6.0) {
            return carregada ? 50.0 : 25.0;
        }
        return 0.0;
    }
}

// Classe Furgao
class Furgao extends Veiculo {
    boolean carregado;

    public Furgao(String tipo, double peso, boolean carregado) {
        super(tipo, peso);
        this.carregado = carregado;
    }

    @Override
    public double calcularPrecoPorHora() {
        if (peso <= 3.0) {
            return carregado ? 50.0 : 25.0;
        } else if (peso <= 6.0) {
            return carregado ? 50.0 : 25.0;
        }
        return 0.0;
    }
}

// Classe principal Garagem
public class garagem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o tipo de veículo (Motocicleta, Caminhonete, Furgão, Carro de Passeio): ");
        String tipo = scanner.nextLine();

        System.out.println("Informe o peso do veículo (moto n tem tonelada): ");
        double peso = scanner.nextDouble();

        Veiculo veiculo = null;

        if (tipo.equalsIgnoreCase("Motocicleta")) {
            veiculo = new Motocicleta(tipo, peso);
        } else if (tipo.equalsIgnoreCase("Caminhonete")) {
            System.out.println("A caminhonete está carregada? (true/false): ");
            boolean carregada = scanner.nextBoolean();
            veiculo = new Caminhonete(tipo, peso, carregada);
        } else if (tipo.equalsIgnoreCase("Furgão")) {
            System.out.println("O furgão está carregado? (true/false): ");
            boolean carregado = scanner.nextBoolean();
            veiculo = new Furgao(tipo, peso, carregado);
        } else if (tipo.equalsIgnoreCase("hatchback") || tipo.equalsIgnoreCase("sedan")) {
            veiculo = new CarroPasseio(tipo, peso);
        } else {
            System.out.println("Tipo de veículo não reconhecido.");
            return;
        }

        double preco = veiculo.calcularPrecoPorHora();
        System.out.println("O preço por hora para estacionar o " + tipo + " é R$ " + preco);

        scanner.close();
    }
}
