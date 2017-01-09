// Classic Bridge Crossing Puzzle. 
//Input - number of people (max. 6) followed by time taken by each person (in sorted order)
//Output - Minimum time

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
	vector<int> people; int numberOfPeople; 
	int time;
	int eachPersonTime = 0;
	int k = 2;
	cin >> numberOfPeople;
	for (int i = 0; i < numberOfPeople; i++)
	{
		cin >> eachPersonTime;
		people.push_back(eachPersonTime);
	}

	if (people.size() == 1)
	{
		cout << people[0];
		return 0;
	}

	if (people.size() == 2)
	{
		cout << people[1];
		return 0;
	}
	int lastPerson = people.size() - 1;
	time = people[0] + people[1] + people[lastPerson] + people[1];
	
	while (lastPerson-k >= 2)
	{
		time += people[0] + people[lastPerson - k];
		k++;
	}
	time = time + people[1];

	cout << time;

		_getch();
		return 0;
}


