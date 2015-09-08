#include <stdio.h>
#include <stdlib.h>

char *mystrcpy(char *dest, char *src) {
  char *temp = dest;
  while(*dest++ = *src++);
  return temp;
}

int main(){
  char src[] = "a string.";
  char str[256];
  char *str1 = malloc(256);
  str1 = mystrcpy(str, src);
  printf("%s\n", str);
  printf("%s\n", str1);
  return 0;
}
