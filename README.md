# Gestión de Usuarios - Proyecto DevOps

## Descripción
Este proyecto es una aplicación web dinámica para la gestión de usuarios, desarrollada en Java con Servlets y desplegada en un servidor Tomcat. Además, se utiliza como base para implementar estrategias DevOps, como la gestión de ramas, contenedores con Docker, y pipelines de CI/CD.

## Estrategia de Branching
Se implementaron las siguientes ramas para una gestión eficiente del desarrollo:
- `main`: Contiene la versión estable lista para producción.
- `desarrollo`: Rama intermedia donde se integran nuevas funcionalidades.
- `funcionalidades`: Ramas temporales creadas para trabajar en cambios específicos antes de fusionarlas en `desarrollo`.

## Uso de Contenedores
La aplicación está configurada para ejecutarse en un contenedor Docker. Esto permite que el entorno sea fácilmente replicable y facilita su despliegue en diferentes máquinas. Para ejecutar el contenedor:
```bash
docker build -t gestion-usuarios .
docker run -p 8080:8080 gestion-usuarios
