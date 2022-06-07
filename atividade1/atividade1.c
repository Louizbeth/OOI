#include <stdio.h>
#include <stdlib.h>
#define QUANT_NUM 6
#define MIN 1
#define MAX 60

int main()
{
  // Preparar os dados
  int numero, num_jogados[QUANT_NUM], num_sorteados[QUANT_NUM];
  int i, j, k, repetido, pontos = 0, num_menor, ordenadas;

  srand(time(0));

  for (i = 0; i < QUANT_NUM; i++)
  {
    num_jogados[i] = 0;
  }

  // Pedir 6 números entre 1 e 60
  for (i = 0; i < QUANT_NUM; i++)
  {
    do
    {
      printf("[>] Digite o %do numero entre 1 e 60: ", i + 1);
      scanf("%d", &numero);

      repetido = num_jogadosReptidos(num_jogados, numero);
      if (repetido == 1)
      {
        printf("Digite outro valor.\n");
      }
      else if (numero < 1 || numero > 60)
      {
        printf("Número Inválido.\n");
      }

    } while (numero < 1 || numero > 60 || repetido == 1);
    num_jogados[i] = numero;
    printf("[*] O %do numero %d foi inserido com sucesso!\n", i + 1, num_jogados[i]);
  }

  // Sortear 6 números entre 1 e 60
  for (i = 0; i < QUANT_NUM; i++)
  {
    do
    {
      numero = rand() % MAX - MIN;
      repetido = num_jogadosReptidos(num_sorteados, numero);
    } while (repetido == 1);

    num_sorteados[i] = numero;
  }

  for (i = 0; i < QUANT_NUM; i++)
  {
    for (j = 0; j < QUANT_NUM; j++)
    {
      if (num_jogados[i] == num_sorteados[j])
      {
        pontos++;
      }
    }
  }

  printf("Números apostados:  ");
  for (i = 0; i < QUANT_NUM; i++)
  {
    if (num_jogados[i] < 10)
    {
      printf("0");
    }
    printf("%d ", num_jogados[i]);
    if (i < 5)
    {
      printf("- ");
    }
  }

  printf("\nNúmeros sorteados:  ");
  for (i = 0; i < QUANT_NUM; i++)
  {
    if (num_sorteados[i] < 10)
    {
      printf("0");
    }
    printf("%d ", num_sorteados[i]);
    if (i < 5)
    {
      printf("- ");
    }
  }

  if (pontos == 4)
  {
    printf("\nFez a quadra!");
  }
  else if (pontos == 5)
  {
    printf("\nFez a quina!");
  }
  else if (pontos == 6)
  {
    printf("\nFicou rico!! Fez a sena.");
  }
  else
  {
    printf("\nNenhum acerto.");
  }
  printf("\n");
  return 0;
}

int num_jogadosReptidos(int vetor[], int numero)
{
  int i = 0, repetido = 0;
  while (vetor[i] != NULL && repetido == 0)
  {
    if (vetor[i] == numero)
    {
      repetido = 1;
    }
    i++;
  }

  return repetido;
}