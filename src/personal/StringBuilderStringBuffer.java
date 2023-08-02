package personal;

public class StringBuilderStringBuffer {

    // https://www.devmedia.com.br/diferencas-entre-string-stringbuilder-e-stringbuffer-em-java/29865

    public static void main(String[] args) {

        String agencia = "12345";
        String conta = "6789";
        String dac = "10";

        StringBuilder stringBuilder = createStringBuilder();

        stringBuilder.append(agencia);
        stringBuilder.append(conta);
        stringBuilder.append(dac);
        System.out.println(stringBuilder);

        //TESTE TEMPO DE EXECUÇÃO STRING BUILDER
        StringBuilder strBuilder = createStringBuilder();
        long tStart = System.currentTimeMillis();
        for(int i = 0; i < 100000; i ++){
            strBuilder.append("a");
        }
        long tEnd = System.currentTimeMillis();
        long tResult = tEnd - tStart;
        System.out.println("Tempo de Execução com StringBuilder = " +tResult+"ms");

        //TESTE TEMPO DE EXECUÇÃO STRING BUFFER
        StringBuffer strBuffer = createStringBuffer();
        tStart = System.currentTimeMillis();
        for(int i = 0; i < 100000; i ++){
            strBuffer.append("a");
        }
        tEnd = System.currentTimeMillis();
        tResult = tEnd - tStart;
        System.out.println("Tempo de Execução com StringBuffer ="+tResult+" ms");

    }

    private static StringBuffer createStringBuffer() {
        return new StringBuffer();
    }

    private static StringBuilder createStringBuilder() {
        return new StringBuilder();
    }
}
