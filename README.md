# Calculadora de IMC - App Android

Este é um **app Android** escrito em **Kotlin** que calcula o Índice de Massa Corporal (IMC) e mostra a classificação correspondente na tela. Ele utiliza **ViewBinding** para manipulação de views de forma segura e eficiente.

## 📋 Funcionalidades
- Entrada de peso (kg) e altura (m) pelo usuário.
- Cálculo do IMC.
- Exibição do IMC e da classificação diretamente na tela.
- Validação de entradas inválidas.

## 📊 Classificação do IMC
| IMC                | Classificação       |
|--------------------|-------------------|
| Menor que 18.5     | Abaixo do peso    |
| 18.5 até 24.9      | Peso normal       |
| 25.0 até 29.9      | Sobrepeso         |
| 30.0 até 34.9      | Obesidade grau I  |
| 35.0 até 39.9      | Obesidade grau II |
| Maior ou igual 40  | Obesidade grau III|

### **MainActivity.kt**
- Manipula a interface usando **ViewBinding**.
- Contém funções `calcularIMC()` e `classificarIMC()`.

### **activity_main.xml**
- Layout simples com `EditText` para peso e altura, `Button` para calcular, e `TextView` para exibir resultado.

## ⚙️ Configuração do ViewBinding
No `build.gradle` (Module: app), dentro de `android {}`:
```gradle
buildFeatures {
    viewBinding true
}
```

## 📝 Como Executar
1. Abra o projeto no **Android Studio**.
2. Sincronize o Gradle para aplicar o ViewBinding.
3. Conecte um dispositivo ou use o emulador.
4. Clique em **Run**.

## 🛠️ Tecnologias Utilizadas
- **Kotlin**
- **Android SDK**
- **ViewBinding**

## Capturas de Telas
<p align="center">
  <img src="https://github.com/joaopauloleitecosta/calcular-imc/blob/main/imc_inicial.png" width="300" alt="Tela inicial">
  <img src="https://github.com/joaopauloleitecosta/calcular-imc/blob/main/imc_cliquebotao.png" width="300" alt="Tela com calculo imc">
</p>
