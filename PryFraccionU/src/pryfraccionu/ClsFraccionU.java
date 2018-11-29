
package pryfraccionu;

public class ClsFraccionU {
    private int _numerador;
    private int _denominador;

    public ClsFraccionU() {
        this._numerador = 0;
        this._denominador = 1;
    }

    public ClsFraccionU(int n, int d) {
        this._numerador = n;
        this._denominador =(d==0)?1:d;
    }
     public ClsFraccionU(ClsFraccionU q) {
        this._numerador = q._numerador;
        this._denominador = q._denominador;
    }
     //GETTER Y SETTER

    public int numerador() {
        return _numerador;
    }

    public void numerador(int _numerador) {
        this._numerador = _numerador;
    }

    public int denominador() {
        return _denominador;
    }

    public void denominador(int _denominador) {
        this._denominador = _denominador;
    }

    @Override
    public String toString() {
        this.Simplificar();
        String p=_numerador +"/"+_denominador;
        if (_numerador > _denominador){
            p= (int)(_numerador / _denominador)+" "+(_numerador % _denominador)+" / "+ (_denominador);
        }
        return p;
    }
    public float Valor(){
        return (_numerador / _denominador);
    }
    public void Ala (int k){
        this._numerador = (int)Math.pow(_numerador, k);
        this._numerador = (int)Math.pow(_denominador, k);
    }

    public void Simplificar() {
        int divisor = 2;
        while (divisor <=_numerador && divisor <=_denominador ){
            while (_numerador% divisor == 0 && _denominador %divisor == 0){
                _numerador/=divisor;
                _denominador/=divisor;
            }
            divisor +=1;
        }
    }
      public  ClsFraccionU Inversa(ClsFraccionU a){
     return new ClsFraccionU(a._denominador, a._numerador);
  }
    
}
