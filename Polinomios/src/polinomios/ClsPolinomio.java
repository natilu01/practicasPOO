
package polinomios;

public class ClsPolinomio {
    //Atributos
    private int _grado;
    private float _coef [];//vector para hacer contador
    //constructores

    public ClsPolinomio(int grado, float[]coef) {
        this._grado = grado;
        this._coef = coef;
    }

    
    public ClsPolinomio(ClsPolinomio g) {
        this._grado = g._grado;
        this._coef = g._coef;
    }
    public ClsPolinomio(int g) {
        _grado = g;
        _coef =new float [g+1];
    }
    //getters y setters

    public int grado() {
        return _grado;
    }

    public void grado(int _grado) {
        this._grado = _grado;
    }

    public float[] coef() {
        return _coef;
    }

    public void coef(float[] _coef) {
        this._coef = _coef;
    }
    //individuales nosotros creamos 
     public float coef(int i) {
        return _coef[i];
    }

    public void coef(int i, int v) {
        this._coef [i]= v;
    }
    //Metodos
    //evaluar
    public float Fx(float valorx ){
        float Fk=0;
        for (int i =this._grado; i>=0; i--) {
            Fk+=_coef[i]*(float)(Math.pow(valorx, i));
        }
        return Fk;
    }
    //Evaluacion
    public float []evalua(float vi, float vf, float dx){
    int lim =(int)((vf-vi)/dx+1);
    int i =0;
    float []r=new float [(int)((vf-vi)/dx+1)];
        for (float x = vi; x <= vf; x+=dx) {
            r [i]=Fx(x);
            i++;
        }
        return r;
}
    public ClsPolinomio suma (ClsPolinomio b){
        ClsPolinomio r;
        if (_grado>b._grado) {
            r=new ClsPolinomio (this);
            for (int i = 0; i <b._grado; i++) {
                r._coef[i]+=b._coef[i];
            }
        }
        else {
            r=new ClsPolinomio (b);
            for (int i = 0; i <_grado; i++) {
                r._coef[i]+=this._coef[i];
            }
        }
        return r;
    }

    
    public String Ver() {
        String linea=_coef[_grado]+"X^"+_grado;
        for (int i =_grado-1; i >=0; i--) {
            if (_coef [i]!=0){
                if (_coef[i]>0){
                    linea+="+";
                    linea+=_coef[i]+"X^"+"i";
                }
            }
            if (_coef[0]>0){
                linea+="+";
                linea+=_coef[0];
            }
        }
        return linea;
    }
    
}