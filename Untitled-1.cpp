#include <iostream>
using namespace std;
class Utilitario {
private:
  int* vetor;
  int tamanho;
public:
  Utilitario(int* vet, int tam) {
     vetor = vet;
     tamanho = tam;
  }
  int encontrarMaiorNumero() {
      int maior = vetor[0];  
      for (int i = 1; i < tamanho; i++) {
      if (vetor[i] > maior) {
            maior = vetor[i];
      }
    }
    return maior;
  }