#include <stdio.h>
#include <math.h>
#define N 15
int lista [N]={10,7,2,1,76,9,8,3,4,5,2,3,4,5};
int trocas = 0;
int comp = 0;

void main(){
	int w ; 
	printf("SHELL SORT\n\n");
	printf("Lista original:");
	for (w = 0 ; w < n ; w++) {printf("%d", lista[w]);}
	shellSort(lista,n);
	printf("\nLista ordenada:");
	for (w = 0 ; w < N ; w++) {printf("%d", lista[w]);}
	printf("\n\nComparacoes:%d\ntrocas:%d\n\n", comp, trocas);
	}
void shellSort(int *lista, int tamanho){
	int i, j, aux;
	float k = log (tamanho + 1) /log (3);
	k = floor (k + 0.5);
	int h = (pow(3,k)-1)/2
	while (h>0){
		for (i = 0 ; i < tamanho-h ; i++){
			comp++;
			if (lista[i] > lista[i+h]){
				aux = lista[i+h];
				lista[i+h] = lista[i];
				lista[i] = aux;
				j = i - h;
				trocas++;
				while(j >= 0){
					comp++;
					if (aux < lista[j]){
						lista [j+h] = lista[j];
						lista[j] = aux;
						troca++;
				    } else {break;}
				    j=j-h;
				}		
			}
		}h = (h-1)/3;
	}