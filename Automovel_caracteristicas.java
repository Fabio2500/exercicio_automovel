class Automovel_caracteristicas{
    String chassi;
    String marca;
    String modelo;
    float tanque_capacidade;
    float consumo;
    float andar;

  
    public float percorre(float distancia){
   	andar = tanque_capacidade - distancia/consumo;
    return andar;
   }
}
