#include <stdio.h>
#include <stdlib.h>
#include "Person.h"

void talk (PersonPtr p) 
{
	printf("Hi, my name's %s\n", p->name);
	printf("and my age is %i\n", p->age);
	printf("\n");
}

void commentAboutAge(PersonPtr p) 
{
	if (p->age < 5) {
		printf("baby\n");
	}
	if (p->age == 5) {
		printf("time to start school\n");
	}
}

PersonPtr make_person(String aName, int anAge) 
{
	PersonPtr p = (PersonPtr)malloc(sizeof(struct Person));
	p->name = aName;
	p->age = anAge;
	return p;
}

int main(void) 
{
	PersonPtr ls = make_person("Luke Skywalker",34);
	PersonPtr wp = make_person("Winston Peters",48);
	
	talk(ls);
	talk(wp);
	
	return 0;
}