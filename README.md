# inventory-service

An expirmental application to provide a simple web-application for managing the stock some products/items. To start of I'm thinking of this a very light wieght thing were product has simple meta-data like sku, name, description, number available and a price. 

## Prerequisites

You will need [Leiningen][] 2.0.0 or above installed.

[leiningen]: https://github.com/technomancy/leiningen

The application currently expects a postgres database to exist, there is a docker file that starts one up for you.

## Running
The application usess [Ragtime](https://github.com/weavejester/ragtime) to create the database and do migrations. To spin up to the latest version use:

    lein migrate


To rollback

    lein rollback

To start a web server for the application, run:

    lein ring server

## License

Copyright © 2018 FIXME
