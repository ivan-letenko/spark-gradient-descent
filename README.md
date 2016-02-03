# Distributed Batch Gradient Descent (Spark)
Implementation of a distributed batch gradient descent algorithm for Apache Spark in Java.
For more information about algorithm see Andrew Ng’s machine learning course on Coursera.

#### How to build:
mvn package
#### How to run:
`JavaSimpleGD <file> <dimensions> [<iterations> <rate> <convergence>]`

For example:

`spark-submit --class "JavaSimpleGD" --master local[4] spark-gradient-descent-1.0.jar data-norm.csv 2 200 0.6`
#### Experiment:
For the test dataset (data-norm.csv) convergence is achieved after 152 iterations at value of learning rate = 0.6.
The root-mean-square error (RMSE) of predicted values is 0.135867

Θ0= 0.11756730664520179, Θ1=0.8671378657592101

![Visualization of the data-norm.csv dataset.](https://raw.githubusercontent.com/ivan-letenko/spark-gradient-descent/master/data-norm.png)

The alorithm is also tested on a [subset](https://github.com/spark-mooc/cs190-data) of the [Million Song Dataset](http://labrosa.ee.columbia.edu/millionsong/) from BerkeleyX Spark Intro MOOC.
The RMSE of the model is 15.2921
