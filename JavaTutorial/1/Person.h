struct Person {
	char* name;
	int age;
};

/* useful Java-like abbreviation for "char *" */
typedef char* String;

/* useful abbreviation for "struct Person *" */
typedef struct Person* PersonPtr;

void talk(PersonPtr p);
void commentAboutAge(PersonPtr p);
PersonPtr make_person(String aName, int anAge);