/*
2. Crear una clase Coche, a través de la cual se pueda conocer el color del coche, la marca, el modelo, 
el número de caballos, el número de puertas y la matricula. Crear el constructor del coche, así como los métodos 
que considere necesarios. Crear una clase (JFrame Form) Prueba_Coche que instancie varios coches, 
cambiándole el color a lo largo de la vida a algunos de ellos y mostrándolo por pantalla (utilizando JTable, 
utilice con JPoPMenu las opciones de modificar y eliminar, además utilice archivo de texto en Java 
para almacenar y cargar la información).
 */
package Coche;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

public class CCoche {
    //atributos
    String color;
    String marca;
    String modelo;
    int noCaballos;
    int noPuertas;
    String matricula;
    
    CCoche(){
    //metodo constructor    
    }
    
    //metodos set y get de los atributos
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNoCaballos() {
        return noCaballos;
    }

    public void setNoCaballos(int noCaballos) {
        this.noCaballos = noCaballos;
    }

    public int getNoPuertas() {
        return noPuertas;
    }

    public void setNoPuertas(int noPuertas) {
        this.noPuertas = noPuertas;
    }

    public String getMatricula() {
        return matricula;
    }
    
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }   
    
    //creando archivo txt para almacenar los datos ingresados
    public void crearArchivo(JTable jtab){
        try{
           String fileRectangulo = "D:\\Documents\\NetBeansProjects\\Coche\\src\\Coche\\datos.txt";
           BufferedWriter bfw = new BufferedWriter(new FileWriter(fileRectangulo));
            for (int i = 0; i < jtab.getColumnCount(); i++) {
                bfw.write(jtab.getColumnName(i) + "      ");
            }
            bfw.write("\n");
            for (int i = 0; i < jtab.getRowCount(); i++) {
                for (int j = 0; j < jtab.getColumnCount(); j++) {
                    bfw.write(jtab.getValueAt(i, j).toString() + "           ");
                }
                bfw.newLine();
            }
            bfw.close();
            JOptionPane.showMessageDialog(null, "El archivo fue creado correctamente.");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al crear el archivo." + e.getMessage());
        }
    }
    
    //llenar tabla con los registros
    public void llenarTablaCoche(String col, String marc, String model, int noCab, int noPuert, String matric, JTable tabla){
       //asignar los valores obtenidos
        setColor(col);
        setMarca(marc);
        setModelo(model);
        setNoCaballos(noCab);
        setNoPuertas(noPuert);
        setMatricula(matric);
        //añadimos el registro a la tabla
        try {
            DefaultTableModel tb = (DefaultTableModel) tabla.getModel();
            Object nuevaTab[] = {col,marc,model,noCab,noPuert,matric};
            tb.addRow(nuevaTab);
            JOptionPane.showMessageDialog(null, "Registro Añadido exitosamente"); 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El registro no se pudo añadir "+e.getMessage());
        }
    }
    
    // Eliminar datos de una tabla
    public void eliminaRegistro(JTable tabla){
        DefaultTableModel tb = (DefaultTableModel) tabla.getModel();
        if (tabla.getSelectedRow()>=0){
            tb.removeRow(tabla.getSelectedRow());
        } 
    }
    
    //guardar datos modificados
    public void guardarDatosModificados(JTable tabla, int filaSelec, String co, String ma, String mo, int cab, int pta, String mat){
        try {            
            tabla.setValueAt(co, filaSelec, 0);
            tabla.setValueAt(ma, filaSelec, 1);
            tabla.setValueAt(mo, filaSelec, 2);
            tabla.setValueAt(cab, filaSelec, 3);
            tabla.setValueAt(pta, filaSelec, 4);
            tabla.setValueAt(mat, filaSelec, 5);
            
            JOptionPane.showMessageDialog(null, "Registro Modificado exitosamente");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
    }
}
