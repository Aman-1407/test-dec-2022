# Input variable definitions

variable "aws_region" {
  description = "AWS region for all resources."

  type    = string
  default = "us-east-1"
}

variable "lambda_function_handler" {

  default = "com.example.helloworld.controller.HelloWorldController::handleRequest"

}

variable "lambda_runtime" {

  default = "java11"

}