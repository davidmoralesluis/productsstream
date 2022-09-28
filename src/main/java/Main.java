import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        Producto x=new Producto("cod1","parafusos",3.0);
        Producto y=new Producto("cod2","cravos",4.0);
        Producto po3 = new Producto();
        File newText=new File(System.getProperty("user.dir")+"/src/main/java/produtos.txt");


        DataOutputStream escribir=new DataOutputStream(new FileOutputStream(newText)); //if true añadir
        DataInputStream leer=new DataInputStream(new FileInputStream(newText));

        escribir.writeUTF(x.getCodigo());
        escribir.writeUTF(x.getDescricion());
        escribir.writeDouble(x.getPrezo());
        escribir.writeUTF(y.getCodigo());
        escribir.writeUTF(y.getDescricion());
        escribir.writeDouble(y.getPrezo());
escribir.close();

        while (leer.available()!=0){
            System.out.println("quedan "+leer.available()+" bytes");
            po3.setCodigo(leer.readUTF());
            po3.setDescricion(leer.readUTF());
            po3.setPrezo(leer.readDouble());

            String codigo = po3.getCodigo();
            String descricion = po3.getDescricion();
            Double prezo = po3.getPrezo();
            System.out.println(codigo + "," +descricion+"," + prezo);


        }

        leer.close();
    }
}
