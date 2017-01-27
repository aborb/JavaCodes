long long convertBinaryToBase(int x, int base) 
{
  if (x == 0)
    return 0;
  return base * convertBinaryToBase(x / 2, base) + (x % 2);
}