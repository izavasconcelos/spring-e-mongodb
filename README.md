# spring-e-mongodb
Curso de Spring Framework e MongoDB


-> Primeiros Passos:

Instalação do MongoDB e Mongo Compass no Ubuntu

-> CRUD com Compass - Creat Read Update Delete

MongoDB CRUD Operations: (https://docs.mongodb.com/manual/crud/)

# Create Operations
db.collection.insertOne() New in version 3.2

db.collection.insertMany() New in version 3.2
# Read Operations
db.collection.find()
# Update Operations
db.collection.updateOne() New in version 3.2

db.collection.updateMany() New in version 3.2

db.collection.replaceOne() New in version 3.2
# Delete Operations
db.collection.deleteOne() New in version 3.2

db.collection.deleteMany() New in version 3.2

# Others
db.collection.find().pretty() 

db.collection.find({"nome":"Izabela"}).pretty() -> busca pelo nome 

db.collection.find({"nome":"Izabela"}).count() -> retorna a quantidade

db.collection.find().sort({"nome":1}).pretty() -> retorna com nome em ordem alfabética

# Gerenciar Usuários
*Listar usuários*

db.getUsers()

*Criar usuário*

db.createUser({user:"izabela",pwd:"123",roles:[{role:"readWrite",db:"dbaula4"}]})

roles() -> permissões de acesso - Perfis de acesso

*Autenticar*

db.auth("izabela","123")

# Importar dados de um CSV
-CSV
