# Остров: Симуляция Экосистемы

Этот проект представляет собой симуляцию экосистемы на острове, где животные и растения взаимодействуют друг с другом. Проект написан на Java с использованием принципов объектно-ориентированного программирования (ООП) и многопоточности.

## Описание

Проект моделирует остров, состоящий из массива локаций (клеток). Каждая клетка может содержать растения и животных. Животные могут:

- **Есть**: Травоядные могут есть растения, хищники могут есть других животных.
- **Передвигаться**: Животные могут перемещаться между соседними клетками.
- **Размножаться**: Животные могут размножаться, если на клетке есть пара.
- **Умирать**: Животные могут умереть от голода или быть съеденными хищниками.

Растения могут расти на клетках, но их количество ограничено.

## Структура проекта

Проект состоит из следующих классов:

- **Animal**: Абстрактный класс, представляющий животных. Содержит общие методы и свойства для всех животных.
- **Wolf**: Класс, представляющий волка.
- **Rabbit**: Класс, представляющий кролика.
- **Plant**: Класс, представляющий растения.
- **Location**: Класс, представляющий клетку острова. Содержит списки животных и растений на клетке.
- **IslandSimulation**: Основной класс, управляющий симуляцией.

## Установка и запуск

- [INSTALL](https://github.com/ileztom/control-version-of-the-system/blob/develop/INSTALL.md)

## Версии обновления проекта

- [Версии проекта](https://github.com/ileztom/control-version-of-the-system/blob/develop/CHANGELOG.md)

  ### Заключение

Этот файл `README.md` предоставляет краткое описание проекта, инструкции по установке и запуску, а также дополнительную информацию о проекте. Вы можете адаптировать его под свои интересы, добавив больше деталей или изменив структуру.
