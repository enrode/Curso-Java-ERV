

public class Cat {    
    String name;
    String color;
    //El peso del gato esta dado en gramos
    String enteroWeight;
    int weight;
    

public String talk(){
return "miau";
}

public void eat(String food){
    
    System.out.println("El gato va a comer " + food);
}

public String toString(){
return "El gato se llama: " + name + " y es de color: " + color;
}
public static void main(String[] args){
Cat gato1 = new Cat();
gato1.name = args[0];
gato1.color = args[1];
gato1.enteroWeight = args[2];
gato1.weight = Integer.parseInt(gato1.enteroWeight);

if(gato1.weight <= 500){
    System.out.println("El gato pasa a la sala de cuidados especiales");
}else if(gato1.weight < 2000 & gato1.weight > 500){
    System.out.println("El gato esta Sano");
}else if(gato1.weight > 2000){
    System.out.println("El gato esta Gordo");
}

//Cat gato2 = new Cat ();
//Asignar valores a variables
//Imprimir los atributos de rayo
System.out.println(gato1.talk());
System.out.println(gato1.toString());
gato1.eat("Pescado");
}
}
