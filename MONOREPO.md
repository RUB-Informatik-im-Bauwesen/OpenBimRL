# Monorepo integration notes

This repository is a git submodule of `openbimrl` at `OpenBimRL-Schema/`.

## Local schema extensions (working tree)

- `schema/OpenBimRL.xsd`: optional `<Script language="…">` on `NodeType`; `typeHint` / `collectionType` on `OutputType`.
- `ScriptType.java` + updates to `NodeType` / `OutputType` / `ObjectFactory`.
- Bazel module: `MODULE.bazel` + `BUILD.bazel` (`//:openbimrl_api`).

Engine consumes this via `bazel_dep(name = "openbimrl_schema")` + `local_path_override`.
