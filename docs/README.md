# 技術のTips

## application.yaml

・メリット：日本語書いてもEclipseエラーにならない

## DBマイグレーション

・flywayツールでDBのバージョン管理を実現

・resource配下のdb/migrationのSQLを自動実行

・flyway_schema_historyテーブルが自動作成され、そこに履歴が残る

・application.yamlに記載が必要。設定しないとInitializedのエラーがでる。

## Swagger

・OpenAPI化している

・http://XXXXX/swagger-ui.html

## Gitのバージョン表示

actuatorとプラグインを使う
id "com.gorylenko.gradle-git-properties" version "1.5.1"

http://localhost:8080/actuator/info
・
## Dokcer-Compose up

docker-compose up はDokcerコマンドの引数を設定できるイメージ
あくめでDockerのイメージファイルは個々で用意が必要
docker-compose でサービス名つけると、Docker内の名前解決が可能

##  課題

・　Jenkinsでの自動CI/DIデプロイ設定

　　→　Sonarqubeはなんぞや。

https://medium.com/@khandelwal12nidhi/ci-cd-with-jenkins-and-ansible-e9163d4a6e82

・　JenkinsからBuildしたファイルをDockerでJarファイルで実行する方法

・　DockerHubのサーバの作り方

・　Kubernates

・　