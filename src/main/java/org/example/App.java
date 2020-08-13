package org.example;

import com.azure.cosmos.CosmosClientBuilder;

public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        CosmosClientBuilder builder = new CosmosClientBuilder();
    }
}
