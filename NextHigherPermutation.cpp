// Find the next higher permutation of a number and print it. If it doesn't exist, print '-1'.
// ex. - Number - 32876 --> next higher permutation = 36278
// ex.   Number - 134  ---> next higher permutation = 143
// ex. Number - 4321 ----> next higher permutation doesn't exist. Print -1

#include"stdafx.h"
#include<conio.h>
#include <cmath>
#include <cstdio>
#include <vector>
#include<string>
#include <iostream>
#include <algorithm>
using namespace std;

int main()
{
	string s1;
	getline(cin, s1);
	vector <char> v; int check =0;

	for (int i = 0; i < s1.length(); i++)
	{
		v.push_back(s1[i]);
	}
	
	int j;
	int index1, index2;

	for ( j = v.size() - 1; j > 0; j--)
		{
			if (v[j-1] < v[j])
			{
				index1 = j - 1;
				check = 1;             //there exists a permutation flag
				break;
			}
		}
		if (check == 0)
		{ 
			cout << "-1";             //solution doesn't exist
			return false;
		}

		for (int i = v.size() - 1; i > index1; i--)
		{
			if (v[i] > v[index1])
			{
				index2 = i;
				break;
			}
		}
		 
		swap(v[index1], v[index2]);              
		reverse(v.begin() + index1 + 1, v.end());


	for (int i = 0; i < v.size(); i++)
	{
		cout << v[i];
	}

		_getch();
		return 0;
}


