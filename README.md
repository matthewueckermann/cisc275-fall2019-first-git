# cisc275-fall2019-first-git
1. Create java files to make this code compile and run.

2. What five objects are created in the main?

	The List dogs, the three Dog objects that go in it, and the comparator object.
	All of them had new command used when created.
	
3. Can you spot the Comparator constructor call? Where is the class definition for the Comparator?

	The Comparator constructor call occurs in the Collections.sort call, as the second term is
	new Comparator<Animal>(), which is the constructor call. The class definition of the Comparator
	is the term in the {} following it, which includes the compare method definition.