package Colas;
public class Cola {
        
    NodoCola UltVal,fiin;
    int tam;
    
    public boolean Vacía(){
        return UltVal == null;
    }
    
    public void Insertar(String dato){
        NodoCola nod = new NodoCola(dato);
        if(Vacía()){
            UltVal = nod;
        }
        else{
            fiin.sig = nod;
        }
        fiin = nod;
        tam++;
    }
    
    public String Eliminar(){
        if(!Vacía()){
            UltVal = UltVal.sig;
            tam--;
            System.out.println("Se elimino un elemento.....");
        }
        else{
            System.out.println("La cola no tiene elementos que eliminar.....");
        }
        return null;
    }
    
    public void Mostrar(){
        NodoCola recorrer = UltVal;
        if(!Vacía()){
            while(recorrer != null){                
                System.out.print("["+recorrer.dato+"] ");                
                recorrer = recorrer.sig;
            }
        }
        else{
            System.out.println("La cola se encuentra vacía.....");
        }
    }
}
