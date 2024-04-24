FROM node:21-alpine3.18

WORKDIR /app

COPY package*.json .

RUN npm install

EXPOSE 8000

COPY index.js .

CMD [ "npm", "run", "dev" ]