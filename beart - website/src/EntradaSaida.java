import java.util.Scanner;

public class EntradaSaida {
    public static Scanner scanner = new Scanner(System.in).useDelimiter("\\s+");
    
    

    public static int escolherOpcao() {
        System.out.println(
                "[1] Cadastro Instituição \n[2] Log-in Instituição \n[3] Log-in Aluno \n[4] Contatos \n[5] Sair");
        return scanner.nextInt();
        // Opção inicial para o usuário, sendo instituição ou aluno
    }

    private static String recebeString() {
        String recebeTexto = scanner.next();
        scanner.nextLine();
        return recebeTexto;

        //Valida o espaço na string
    }
    
    public static String recebeDado(String msg) {
        System.out.println("\n Digite " + msg);
        return EntradaSaida.recebeString();
       
        // Recebe os dados do cadastro da instituição
    }

    public static String entrarEscola(String msg) {
        System.out.print("Informe " + msg + " da escola:");
        return EntradaSaida.recebeString();
       
        // Recebe os dados para o login da instituição
    }

    public static int escolherOpcaoEscola() {
        System.out.println("[1] Cadastrar aluno \n[2] Remover alunos \n[3] Visualizar alunos \n[4] Sair da conta");
        return scanner.nextInt();
        // Menu da instituição
    }

    public static String cadastrarAluno(String msg) {
        System.out.println("Informe " + msg + " do aluno: ");
        return EntradaSaida.recebeString();
       
        // Cadastro do aluno feito pela instituição após o login
    }

    public static String entrarAluno (String msg){
        System.out.println("Informe " + msg + " do aluno: ");
        return EntradaSaida.recebeString();
       
        // Login do aluno
    }

    public static int escolherOpcaoAluno() {
        System.out.println("[1] Agendar curso \n[2] Materiais \n[3] Sair da conta");
        return scanner.nextInt();
        // Menu do aluno
    }

        public static int escolherOpcaoCurso() {
        System.out.println("[1] Música \n[2] Pintura \n[3] Dança \n[4] Fotografia \n[5] Teatro \n[6] Escultura \n[7] Sair");
        return scanner.nextInt();
        // Menu do aluno
    }

    public static void mostrarAlerta(String string) {
    }

    public static void mostrarAlunos(String listarAlunos) {
        System.out.println(listarAlunos);
    }

    public static int solicitaPosicao() {
        System.out.println("Informe a posição do aluno a ser removido: ");
        return scanner.nextInt();
    }

    public static void mostrarCursos(String listarCursos) {
        System.out.println(listarCursos);
    }

    public static int escolherOpcaoMatricula(){
        System.out.println("\nDeseja realizar matricula para esse curso? \n[1] Sim \n[2] Não");
        return scanner.nextInt();
    }
}