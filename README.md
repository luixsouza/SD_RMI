# RMIProject - Exemplo de Comunicação Remota com Java RMI

Este repositório contém uma implementação simples de **Java RMI (Remote Method Invocation)** para comunicação entre um servidor e um cliente em uma rede local.

## 📌 Tecnologias Utilizadas

- **Java 17**
- **RMI (Remote Method Invocation)**

## 📂 Estrutura do Projeto

```
SD_RMI/
│── src/
│   ├── Hello.java          # Interface remota
│   ├── HelloServer.java    # Implementação do servidor
│   ├── HelloClient.java    # Implementação do cliente
│── bin/                    # Arquivos compilados (.class)
│── README.md               # Documentação do projeto
```

## 📜 Descrição dos Arquivos

- **Hello.java**: Define a interface remota que será utilizada pelo servidor e pelo cliente.
- **HelloServer.java**: Implementa a interface remota e registra o objeto no RMI Registry.
- **HelloClient.java**: Obtém uma referência ao objeto remoto e invoca o método `sayHello()`.

## 🚀 Como Executar o Projeto

### 1️⃣ **Compilar os Arquivos**

Abra o terminal e navegue até a pasta do projeto:

```sh
cd SD_RMI/src
```

Agora, compile os arquivos Java:

```sh
javac --release 17 -d bin src/*.java
```

Isso criará os arquivos `.class` na pasta `bin`.

### 2️⃣ **Iniciar o RMI Registry**

Antes de executar o servidor, é necessário iniciar o **rmiregistry**. Dentro da pasta `bin`, execute:

```sh
cd bin
start rmiregistry
```

Se estiver no PowerShell, use:

```powershell
Start-Process -NoNewWindow rmiregistry
```

Se estiver no Linux/Mac, utilize:

```sh
rmiregistry &
```

### 3️⃣ **Executar o Servidor**

No mesmo terminal, rode o servidor:

```sh
java -cp . HelloServer
```

Saída esperada:

```
Servidor RMI pronto...
```

### 4️⃣ **Executar o Cliente**

Em outro terminal (ou outra máquina na rede), rode:

```sh
java -cp . HelloClient
```

Saída esperada:

```
Olá, cliente! Conexão RMI bem-sucedida!
```
