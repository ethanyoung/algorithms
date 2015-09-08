#include <stdio.h>

char *mystrcpy(char *dest, char *src) {
  while(*dest++ = *src++);
  return dest;
}

int main(){
  char src[] = "a string.";
  char str[256];
  mystrcpy(str, src);
  printf("%s\n", str);
  return 0;
}
