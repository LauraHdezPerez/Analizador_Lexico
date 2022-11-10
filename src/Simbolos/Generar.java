/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Simbolos;

import java.io.File;

/**
 *
 * @author Laura Hdez Perez
 */
public class Generar {
    public static void main(String[] args) {
        String ruta = "C:/Users/Laura Hdez Perez/Documents/NetBeansProjects/Analizador_Lexico/src/Simbolos/lexer.flex";
        generarLexer(ruta);
    }
    public static void generarLexer(String ruta){
        File archivo = new File(ruta);
        jflex.Main.generate(archivo);
    }
}
