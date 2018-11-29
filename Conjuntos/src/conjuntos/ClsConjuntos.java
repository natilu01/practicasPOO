
package conjuntos;

public class ClsConjuntos {
    //atributos
    private int _card;
    private String _elem [];
    //Constructores

    public ClsConjuntos(int _card, String[] _elem) {
        this._card = _card;
        this._elem = _elem;
    }
    public ClsConjuntos(ClsConjuntos a) {
        this._card =a._card;
        this._elem =a._elem;
    }
    public ClsConjuntos() {
        _card =0;
        _elem =new String [10];
    }
    public ClsConjuntos(int card) {
        this._card =card;
        _elem =new String [_card];
    }
    //getter y setter

    public int card() {
        return _card;
    }

    public void card(int _card) {
        this._card = _card;
    }

    public String[] elem() {
        return _elem;
    }

    public void elem(String[] _elem) {
        this._elem = _elem;
    }
    //get y set direccionados en un punto especifico 
    public String elem (int i){
        return _elem [i];
    }
    public void elem (int i, String valor){
        _elem[i]=valor;
    }
    //metodos
    //UNION
    public ClsConjuntos union (ClsConjuntos c){
        ClsConjuntos a;//nuevo conjunto
        boolean existe;
        ClsConjuntos r=new ClsConjuntos (this._card + c._card);
        int cr=this._card;
        //comparar los elementos 
        for (int i = 0; i <_card; i++) {
            r._elem[i]=_elem[i];
        }
        for (int i = 0; i <c._card; i++) {
            existe=true;
            for (int j = 0; j <_card; j++) {
                if (c._elem[i].equals(_elem [j])){
                    existe=true;
                }
            }
            if (!existe){
                r._elem[cr-1]=c._elem[i];
                cr++;
            }
        }
        a=new ClsConjuntos (cr,r._elem);
       return a;
    }
    //interseccion 
    public ClsConjuntos interseccion(ClsConjuntos c){
        ClsConjuntos a;
        boolean existe;
        ClsConjuntos r=new ClsConjuntos (this._card);
        int cr=0;
        //comparar los elementos
        for (int i = 0; i <_card; i++) {
            existe=false;
            for (int j = 0; j <_card; j++) {
                if(c._elem[i].equals(_elem[j])){
                    existe = true;
                }
            }
            if (existe){
                cr++;
                r._elem[cr-1]=c._elem[i];
            }
        }
        a=new ClsConjuntos (cr,r._elem);
        return a;
    }
    //diferencia 
    public ClsConjuntos diferencia (ClsConjuntos c){
        ClsConjuntos a;
        boolean existe;
        ClsConjuntos r=new ClsConjuntos (this._card+c._card);
        int cr=0;
        for (int i = 0; i <_card; i++) {
            existe=false;
            for (int j = 0; j <c._card; j++) {
                if (_elem[i].equals(c._elem[j])) {
                    existe =true;
                }
            }
            if (!existe){
                cr++;
                r._elem[cr-1]=_elem[i];
            }
        }
        a=new ClsConjuntos (cr,r._elem);
        return a;
    }
    //diferencia simetrica AΔB={(A-B)U(B-A)}
    public ClsConjuntos difSimetrica (ClsConjuntos c){
        ClsConjuntos r=new ClsConjuntos (this.diferencia(c));
        ClsConjuntos s=new ClsConjuntos (c.diferencia(this));
        return r.union (s);
    }
    //PRODUCTO CARTESIANO 
    public ClsConjuntos prodCartesiano (ClsConjuntos c){
        ClsConjuntos r=new ClsConjuntos (_card*c._card);
        int ne=0;
        for (int i = 0; i <_card; i++) {
            for (int j = 0; j <c._card; j++) {
                ne++;
                r._elem[ne-1]="("+_elem[i]+","+c._elem[i]+")";
            }
        }
        return r;
    }
    //ver los elementos del conjunto 

    
    public String Ver() {
        String linea="{";
        for (int i = 0; i <_card; i++) {
            linea+=_elem[i]+" ,";
        }
        linea+="}";
        return linea;
    }
    
}
