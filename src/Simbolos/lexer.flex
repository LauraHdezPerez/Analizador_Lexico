package Simbolos;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

class Yytoken{
    Yytoken (int numToken,String token, String tipo, String lexema1, String lexema2){
        this.numToken = numToken;
        this.token = new String(token);
        this.tipo = tipo;
        this.lexema1 = lexema1;
        this.lexema2 = lexema2;
        
    }


    public int numToken;
    public String token;
    public String tipo;
    public String lexema1;
    public String lexema2;
   


    public String toString(){
        return "Token "+numToken+": "+tipo+" Lexema: "+token+" Lexema1: "+lexema1+" Lexema2: "+lexema2;
    }
}



// JFlex


%% //inicio de declaraciones

%function nextToken

%public

%class metodos

%unicode //soporte unicode representacion de caracteres



%{

    private int contador;
    private ArrayList<Yytoken> tokens;
    
        //Escribir en txt
        private void writeOutputFile() throws IOException{
                        String filename = "file.out";
                        BufferedWriter out = new BufferedWriter(
                                new FileWriter(filename));
                        for(Yytoken t: this.tokens){
                                out.write(t + "\n");
                        }
                        out.close();
        }
%}



%init{
    contador = 0;
    tokens = new ArrayList<Yytoken>();
%init}



%eof{
        try{
                this.writeOutputFile();
        }catch(IOException ioe){
                ioe.printStackTrace();
        }
%eof}






EXP_ALPHA=[A-Za-z_]
EXP_DIGITO=[0-9]
EXP_ALPHANUMERIC={EXP_ALPHA}|{EXP_DIGITO}
NUMERO=({EXP_DIGITO})+
IDENTIFICADOR={EXP_ALPHA}({EXP_ALPHANUMERIC})*
ESPACIO=" "
SALTO_DE_LINEA=\n|\r|\r\n
MENSAJE="\""[^"\""]*"\""
IMPRESION="System.out."
COMENTARIOS= "\//".+//\""
COMENTARIOS_MULTIPLES={LINEAS_INICIALES}[^"/"]*{LINEAS_FINALES} 
LINEAS_INICIALES=[/*,/**]
LINEAS_FINALES=[*/,**/]



/*reglas lexicas */
%%

{NUMERO}    {
    contador++;
    Yytoken t = new Yytoken(contador,yytext(),"NUM", "NUM", yytext());
    tokens.add(t);
    return t;
}

{MENSAJE}    {
    contador++;
    Yytoken t = new Yytoken(contador,yytext(),"MSG", "MSG",yytext());
    tokens.add(t);
    return t;
}

( "package" | "public" | "class" | "static" | "void" | "String" | "int" | "switch" | "case" | "break" | "default" | "println" )   {
    contador++;
    Yytoken t = new Yytoken(contador,yytext(),"PALRE",yytext(),"- - -");
    tokens.add(t);
    return t;
}

( "=" )  {
    contador++;
    Yytoken t = new Yytoken(contador,yytext(),"OPASI", "ASI","- - -");
    tokens.add(t);
    return t;
}

( "+=" )  {
    contador++;
    Yytoken t = new Yytoken(contador,yytext(),"OPASI", "SUA","- - -");
    tokens.add(t);
    return t;
}


{IDENTIFICADOR} {
    contador++;
    Yytoken t = new Yytoken(contador,yytext(),"ID", "ID",yytext());
    tokens.add(t);
    return t;
}

( ";" )    {
    contador++;
    Yytoken t = new Yytoken(contador,yytext(),"OPESP", "DEL","- - -");
    tokens.add(t);
    return t;
}

( "{" )    {
    contador++;
    Yytoken t = new Yytoken(contador,yytext(),"OPESP", "LLI","- - -");
    tokens.add(t);
    return t;
}

( "}" )    {
    contador++;
    Yytoken t = new Yytoken(contador,yytext(),"OPESP", "LLD","- - -");
    tokens.add(t);
    return t;
}

( "[" )    {
    contador++;
    Yytoken t = new Yytoken(contador,yytext(),"OPESP", "COI","- - -");
    tokens.add(t);
    return t;
}

( "]" )    {
    contador++;
    Yytoken t = new Yytoken(contador,yytext(),"OPESP", "COD","- - -");
    tokens.add(t);
    return t;
}

( "(" )    {
    contador++;
    Yytoken t = new Yytoken(contador,yytext(),"OPESP", "PIZ","- - -");
    tokens.add(t);
    return t;
}

( ")" )    {
    contador++;
    Yytoken t = new Yytoken(contador,yytext(),"OPESP", "PDE","- - -");
    tokens.add(t);
    return t;
}

( ":" )    {
    contador++;
    Yytoken t = new Yytoken(contador,yytext(),"OPESP", "DPU","- - -");
    tokens.add(t);
    return t;
}



{ESPACIO}   {

}



{SALTO_DE_LINEA}     {
}

{IMPRESION} {
/*Ignore*/
}

{COMENTARIOS} {
/*Ignore*/
}

{COMENTARIOS_MULTIPLES} {
/*Ignore*/
}