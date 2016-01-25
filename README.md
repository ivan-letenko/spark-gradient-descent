# Distributed Batch Gradient Descent (Spark)
Implementation of a distributed batch gradient descent algorithm for Apache Spark in Java.
For more information about algorithm see Andrew Ng’s machine learning course on Coursera.
For the test dataset (data-norm.csv) convergence is achieved after 152 iterations at value of learning rate = 0.6.
Θ0= 0.11756730664520179, Θ1=0.8671378657592101
#### How to build:
mvn package
#### How to run:
JavaSimpleGD <file> <dimensions> [<iterations> <rate> <convergence>]
For example:
spark-submit --class "JavaSimpleGD" --master local[4] spark-gradient-descent-1.0.jar data-norm.csv 2 200 0.6
