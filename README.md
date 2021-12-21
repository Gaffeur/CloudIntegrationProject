# Cloud Integration Project

The aim of the project is to combine some patterns to transmit messages by using Spring.

Our project work under Java 11.


Let’s begin with the main. You can launch two different XML files. The first one contains a router and a service activator. The second one contains the same router and service activator, but we added an aggregator at the end.

Now, let’s explain how it works. First with channels.xml, we retrieve datas from a json file with an inbound channel adapter. Then we need to transform the JSON into an object to work with it. To do so, we use a transformer. Then we use a recipient list router. This router will deploy all information on both channels. The aim is to prove that we really modify one data with the service activator, but we keep the initial data in the second channel. So, in the first channel we call the method that will modify our data. We have created a small class Pizza and his associated PizzaService. Pizza class just define the object that we are working with and PizzaService the method we use. In the service, we create a new pizza based on the data we have, and we make some modifications (here we add a promotion based on the size and so we change the price). 

After modification, we need to transform the object into JSON to print out a new JSON file. To keep the track of both channels, we do the work separately. This way, we can conserve the initial data (in the database for example) and the new one to have a good historic of what happened. The outbound channel adapter allow us to create a new file with the data we have in the channels. You can find one directory for the data which has no modification “dataOut/nomodif” and one directory for the modify data “dataOut/modif”.


For the second XML file, it’s almost the same protocol. We just change the output, by using an aggregator to have both modify and non-modify data on the same json file.

